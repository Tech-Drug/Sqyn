assert import_string("code:interact") == interact

        # test things not already imported
        func = import_string("os.path:join")
        from os.path import join

        assert func == join

        # test something already imported
        import shiv

        assert import_string("shiv") == shiv == sys.modules["shiv"]

        # test bogus imports raise properly
        with pytest.raises(ImportError):
            import_string("this is bogus!")